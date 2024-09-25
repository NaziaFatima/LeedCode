#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'checkMagazine' function below.
#
# The function accepts following parameters:
#  1. STRING_ARRAY magazine
#  2. STRING_ARRAY note
#

def checkMagazine(magazine_words, note_words):

    # Create a frequency dictionary for words in the magazine
    word_count = {}
    for word in magazine_words:
        if word in word_count:
            word_count[word] += 1
        else:
            word_count[word] = 1

    # Check if each word in the note can be found in the magazine
    for word in note_words:
        if word in word_count and word_count[word] > 0:
            word_count[word] -= 1  # Use one occurrence of the word
        else:
            print("No")
            return

    print("Yes")

# Example usage
magazine = "attack at dawn"
note = "Attack at dawn"
checkMagazine(magazine, note)  # Output: No
