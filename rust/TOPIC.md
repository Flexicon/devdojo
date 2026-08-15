---
topic: rust
kind: language
level: beginner
created: 2026-08-13
test_all: cargo test
test_one: cargo test {problem}
problem_glob: src/problems/{problem}*
---
# Rust

## Goals

Build fluency in core Rust — ownership, borrowing, iterators, Result/Option
error handling, idiomatic stdlib use — through hands-on problems.

## Conventions

- Problems live in `src/problems/pNNN_slug.rs`, registered in
  `src/problems/mod.rs`.
- The statement is the doc comment atop the problem file; tests are colocated
  in `#[cfg(test)] mod tests`.
- Run one problem: `cargo test pNNN` (from this directory). Run all:
  `cargo test`.
- From the repo root: `./dojo bout rust [pNNN]`.

## Progress log

| Problem         | Difficulty | Status | Notes            |
| --------------- | ---------- | ------ | ---------------- |
| p0001-two-sum   | easy       | open   | hashmaps, arrays |
