---
name: new-dojo
description: >
  Scaffold a new topic directory in devdojo — a programming language (rust,
  go), framework (react, rails), or loose concept (DSA in Go, design patterns
  in Kotlin). Use when the user says "new topic", "set up a new topic",
  "new dojo", "I want to learn X", "scaffold <topic>", or wants a fresh
  practice space created with its toolchain and TOPIC.md.
---

# new-dojo

Create a new self-contained topic dojo: minimal toolchain, a `TOPIC.md`
contract, and one passing sanity test proving the test runner works.

## Steps

1. **Normalize the name.** kebab-case; keep the language when the topic is a
   concept: "DSA in Go" → `dsa-go`, "Design patterns in Kotlin" →
   `design-patterns-kotlin`, "Rust" → `rust`. If the dir already exists, stop
   and say so.

2. **Determine kind and language.** kind ∈ language | framework | concept.
   Identify the toolchain language from the topic name; if genuinely
   ambiguous, ask.

3. **Scaffold the toolchain.** Smallest project whose test runner runs, plus
   one trivial passing sanity test. Unknown language → skip the scaffold, say
   so, and note it in TOPIC.md's Conventions for the user to fill in.

   | Language   | Scaffold                                          | Sanity check        |
   | ---------- | ------------------------------------------------- | ------------------- |
   | rust       | `cargo init --lib <dir>` + `src/problems/mod.rs`  | `cargo test`        |
   | go         | `go mod init <dir>` + `problems/`                  | `go test ./...`     |
   | python     | `problems/` + `tests/` (pytest)                    | `pytest`            |
   | typescript | `npm init -y` + vitest + `problems/`               | `npx vitest run`    |

   Every topic also gets three frontmatter fields so the root `./dojo` CLI
   can run it without a topic-specific script:

   | Language   | `test_all`       | `test_one`                         | `problem_glob`            |
   | ---------- | ---------------- | ---------------------------------- | ------------------------- |
   | rust       | `cargo test`     | `cargo test {problem}`             | `src/problems/{problem}*` |
   | go         | `go test ./...`  | `go test ./problems/*{problem}*/` | `problems/*{problem}*/`   |
   | python     | `pytest`         | `pytest -k {problem}`              | `problems/{problem}*`     |
   | typescript | `npx vitest run` | `npx vitest run {problem}`         | `problems/{problem}*`     |

   The CLI normalizes `p1` and `p0001-name` to `p0001`, substitutes it into
   the command and glob, and verifies the glob matches before running a single
   problem.

4. **Write TOPIC.md** from `templates/TOPIC.md` (next to this file). Fill:
   `topic`, `kind`, `created` (today), `level` (default `beginner` unless the
   user says otherwise), the three test fields from the language table above,
   Goals (from the user's request, else a one-line placeholder), Conventions
   (problem layout + per-problem test command for the scaffolded language —
   copy the matching row from AGENTS.md § Problem layout). Leave the progress
   log empty.

5. **Verify.** From the repo root, run `./dojo bout <topic>` — it must pass.
   This proves both the toolchain and the root runner work.

6. **Report.** Dir created, toolchain verified. Next step: `spar` when the
   user is ready for problems.

## Rules

- Minimal scaffold. No CI, no linters, no per-topic README — TOPIC.md is the
  doc.
- Don't generate practice problems here — that's spar's job.
