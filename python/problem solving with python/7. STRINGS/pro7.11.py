""" Write the function countVowels(word) which takes a word as an argument and returns the 
vowels ('a','b','i','o','u') in that word."""

def countVowels(word):
    print(" Word = ",word)
    word  = word.lower()
    return {v:word.count(v) for v in 'aeiou'}
print(countVowels("I Love Python Programming")) 