# devdojo

A personal code playground for staying sharp in the age of agentic coding —
AI-generated, LeetCode-style practice problems for any language, framework, or
concept, solved and reviewed locally.

## How it works

Each topic (`rust/`, `dsa-go/`, `design-patterns-kotlin/`, ...) is a
self-contained directory with its own toolchain and a `TOPIC.md` tracking
level, goals, and progress. Three repo skills drive the training loop:

| Skill      | What it does                                                        |
| ---------- | ------------------------------------------------------------------- |
| `new-dojo` | Scaffold a new topic directory with toolchain + sanity test         |
| `spar`     | Generate practice problems: statement, stub, failing tests          |
| `sensei`   | Review your solution, coach on failures, log progress, calibrate    |

## Usage

Run the bouts from the repo root — no cd-ing into topics:

```bash
./dojo bout            # every topic's tests + pass/fail summary
./dojo bout rust       # one topic
./dojo bout rust p1    # one problem (p1, p0001, p0001-two-sum all work)
```

Or talk to your agent:

- "Set up a new topic for rust" → `new-dojo` scaffolds `rust/`
- "Spar: give me 3 rust problems" → stubs + failing tests to make pass
- Solve, run the tests, then "sensei, review my solution"

See [AGENTS.md](AGENTS.md) for the conventions agents follow here.
