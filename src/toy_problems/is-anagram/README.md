# Is Anagram?


An [anagram](https://en.wikipedia.org/wiki/Anagram) is a word that can be made by rearranging all of the letters from another word. For example: **"silent"** is an anagram of **"listen"** (and _vice-versa_).

Write a function that takes two strings and determines whether or not they are anagrams of each other. You may assume that the input string will only contain lowercase letters from a-z, with no numbers, spaces, or special characters.


## Example Usage:

```clojure
(is-anagram? "listen" "silent") ;;=> true
(is-anagram? "not" "anagram") ;;=> false
(is-anagram? "eat" "teas") ;;=> false
```


## Advanced Content
For a little extra challenge, try extending your function to handle input strings that contain capital letters, spaces, and punctuation.
