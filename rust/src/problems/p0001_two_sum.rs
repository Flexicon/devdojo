//! # p0001 — Two Sum
//!
//! **Difficulty:** easy · **Tags:** hashmaps, arrays
//!
//! Given a slice of integers `nums` and an integer `target`, return the
//! indices of the two numbers that add up to `target`.
//!
//! ## Examples
//!
//! ```text
//! two_sum([2, 7, 11, 15], 9) -> [0, 1]   // nums[0] + nums[1] == 9
//! two_sum([3, 2, 4], 6)      -> [1, 2]
//! ```
//!
//! ## Constraints
//!
//! - Exactly one valid pair exists; don't use the same element twice.
//! - `2 <= nums.len() <= 10^4`
//! - `-10^9 <= nums[i], target <= 10^9`
//! - Return the indices in ascending order.

pub fn two_sum(nums: &[i32], target: i32) -> Vec<usize> {
    todo!()
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn example_basic() {
        assert_eq!(two_sum(&[2, 7, 11, 15], 9), vec![0, 1]);
    }

    #[test]
    fn example_unsorted_pair() {
        assert_eq!(two_sum(&[3, 2, 4], 6), vec![1, 2]);
    }

    #[test]
    fn pair_at_edges() {
        assert_eq!(two_sum(&[1, 5, 5, 10], 11), vec![0, 3]);
    }

    #[test]
    fn negatives() {
        assert_eq!(two_sum(&[-3, 4, 3, 90], 0), vec![0, 2]);
    }

    #[test]
    fn two_elements() {
        assert_eq!(two_sum(&[0, 4], 4), vec![0, 1]);
    }
}
