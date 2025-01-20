# Duplicate String Counter

This document describes a solution for identifying and counting duplicate strings within a list.

**Description**

The provided function takes a list of strings as input and outputs a map containing all the strings that appear more than once in the list. The map keys are the duplicate strings, and the values represent their corresponding occurrence counts.

**Solution**

This approach leverages the `merge()` method of the `HashMap` class, providing a concise and efficient solution for counting the occurrences of each string.

**Advantages**

*   **Efficiency:** The `HashMap` provides efficient lookup and update operations, making it suitable for handling large lists of strings.
*   **Conciseness:** The `merge()` method offers a concise way to handle both adding new strings and updating the counts of existing ones.
*   **Readability:** The code is relatively easy to understand, especially with proper explanations.

**Alternative Solutions**

*   **HashSet:** While a `HashSet` can be used to identify duplicates, it wouldn't provide the counts directly. Additional logic would be needed to track the occurrences.
*   **Stream API:** The Stream API can be used for more complex manipulations, but for this specific task, the `merge()` approach might be more efficient and readable.