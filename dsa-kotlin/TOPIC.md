---
topic: dsa-kotlin
kind: concept
level: beginner
created: 2026-08-15
test_all: ./gradlew test
test_one: ./gradlew test -Pproblem={problem}
problem_glob: src/test/kotlin/problems/{problem}*
---
# DSA in Kotlin

## Goals

Practice data structures and algorithms using Kotlin.

## Conventions

This is a Kotlin/JVM Gradle project using the checked-in Gradle Wrapper and a
Java 21 toolchain. Production code lives in `src/main/kotlin/`, and tests live
in `src/test/kotlin/`. Each generated problem uses
`src/main/kotlin/problems/pNNN-kebab-name.kt` plus
`src/test/kotlin/problems/pNNN-kebab-nameTest.kt`; the test class name must
include the lowercase problem ID (for example, `p0001TwoSumTest`) so the
`-Pproblem` filter can select it.

## Progress log

| Problem | Difficulty | Status | Notes |
| ------- | ---------- | ------ | ----- |
| p0001-two-sum | easy | open | arrays, hashmaps |
| p0002-valid-parentheses | easy | open | stacks, strings |
| p0003-merge-intervals | medium | open | sorting, intervals |
