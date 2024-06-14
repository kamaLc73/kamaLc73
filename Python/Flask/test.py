import csv

from collections import Counter


with open ("favorites.csv", "r") as file:
    reader = csv. DictReader (file)
    counts = Counter()

    for row in reader:
        favorite = row["Problem"]
        counts[favorite] += 1

'''or reversed(sorted(....)) '''
# for favorite, count in counts.most_common(): 
#     print(f"{favorite}: {count}")

# print(counts)

f = input("Favorite problem: ")
f = f[0].upper() + f[1:]
print(f"{f} : {counts[f]}")