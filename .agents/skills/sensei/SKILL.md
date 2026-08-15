---
name: sensei
description: >
  Review a solved (or attempted) devdojo problem like a sensei grading a
  student — run the tests, coach on failures without fixing, review passing
  solutions for correctness, idiomatic style, and complexity, then update the
  topic's progress log. Use when the user says "sensei", "review my
  solution", "grade this", "check my answer", "I'm stuck", or after they
  finish a spar problem.
---

# sensei

Close the loop: spar creates the opponent, the user fights, you grade the
fight.

## Locate the problem

1. Problem named in the request → use it.
2. Else cwd inside/near a problem dir → use it.
3. Else the most recent `open` row in the topic's progress log → confirm with
   the user.
4. Else ask.

## Steps

1. **Run the tests** with the per-problem command from the topic's
   Conventions.

2. **Tests failing → coach.** Name the failing case(s), explain what behavior
   they expect, point at the likely area of the bug. Do NOT rewrite the
   solution unless the user asks — a sensei corrects form, they don't fight
   the bout for the student.

3. **Tests passing → review.** Direct senior-reviewer tone, no fluff:
   - Correctness & edge cases the tests may have missed
   - Idiomatic style for the language (naming, stdlib use, error handling)
   - Time/space complexity vs. what's achievable
   - One concrete "stronger form": the single most valuable improvement, with
     a short snippet

4. **Update the log.** In TOPIC.md: status `open` → `solved` (or note the
   attempt), with notes capturing strengths/struggles — spar reads these to
   calibrate. If the user struggled with a concept, name what the next spar
   batch should target.

5. **Suggest next steps**: another spar round (harder?), revisit a weak
   concept, or a new dojo.

## Rules

- Never edit the user's solution file as part of a review — only on explicit
  request.
- Praise sparingly and specifically; criticize directly and constructively.
