# Check Palindrome
def is_palindrome(s):
    cleaned = ''.join(c.lower() for c in s if c.isalnum())
    return cleaned == cleaned[::-1]
print(is_palindrome("A man a plan a canal Panama"))
print(is_palindrome("hello"))


# Check Symmetrical String
def is_symmetric(s):
    mid = len(s)//2
    return s[:mid] == s[mid:] [::-1]
print(is_symmetric("aboo"))
print(is_symmetric("hello"))


# Reverse Words in String
def reverse_words(s):
    words = s.split()
    return ' '.join(words[::-1])
print(reverse_words("hello world"))


# Remove Kth Character
def remove_kth(s, k):
    if k >= len(s):
        return s
    return s[:k] + s[k+1:]
print(remove_kth("hello", 2))
print(remove_kth("world", 10))


# Check Substring Present
def has_substring(s, sub):
    return sub.lower() in s.lower()
print(has_substring("hello", "world"))
print(has_substring("Python", "Java"))