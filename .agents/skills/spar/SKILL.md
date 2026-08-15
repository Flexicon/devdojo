---
name: spar
description: >
  Generate LeetCode/CodeWars-style practice problems (katas) for a devdojo
  topic — statement, stub, and failing tests the user must make pass. Use when
  the user says "spar", "generate problems", "give me (N) problems",
  "new kata", "exercise me", "harder/easier problems", or asks for practice
  material in a topic directory.
---

# spar

Generate N problems (default 3) for a topic. You write the opponent; the user
fights it. **NEVER solve the problems.**

## Resolve the topic

1. Topic named in the request → use it.
2. Else cwd inside a topic dir (has TOPIC.md) → use it.
3. Else the topic with the most recent progress-log activity → use it.
4. Else ask.

## Steps

1. **Read TOPIC.md**: level, goals, conventions, progress log. Scan existing
   problem slugs and notes so you don't repeat concepts already covered —
   unless the user asks for more of the same.

2. **Calibrate.** Default: match the topic level, ramping slightly as the
   solved count grows. Struggle notes in the log → include a problem
   targeting the weak spot. User said "harder"/"easier" → adjust. Each
   problem gets a difficulty (easy | medium | hard) and 1–3 concept tags
   (e.g. `hashmaps`, `borrowing`, `recursion`).

3. **Generate each problem** following the topic's Conventions section (or
   AGENTS.md § Problem layout if absent). Slug: `pNNN-kebab-name`, NNN = next
   sequence number for the topic. Each problem MUST have:
   - **Statement** — description, 1–2 examples with expected output,
     constraints, difficulty + tags. Self-contained: no external links.
   - **Stub** — the function signature(s) with body `todo!()` (rust),
     `panic("implement me")` (go), `raise NotImplementedError` (python),
     `throw new Error("implement me")` (ts). Nothing more — no hints in code,
     no partial logic.
   - **Tests** — colocated, covering the examples plus edge cases (empty
     input, single element, duplicates, negatives, large input...).
     Deterministic, and they must FAIL against the stub.

4. **Verify failure.** Run the per-problem test command for every new
   problem. Each must fail because the stub is unimplemented — NOT because of
   syntax errors, bad imports, or a broken harness. Fix the harness, never
   the stub.

5. **Log.** Append one row per problem to TOPIC.md's progress log:
   `| pNNN-slug | difficulty | open | tags |`.

6. **Report.** List the problems with one-line teasers and the exact command
   to test each.

## Rules

- Never implement the solution — not "a small part", not pseudocode in the
  stub.
- Problems should teach something appropriate to the topic — a rust topic
  should exercise ownership, iterators, Result/Option, not generic algorithms
  forever.
- Prefer varied concepts across a batch unless the user asked for a focus.
