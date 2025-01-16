import random
list = []
counter = 1
for x in range(random.randint(1, 15)):
    list.append(counter)
    counter+= 1

print("list list list lis list")
print(list)
length = len(list)
maxim = max(list)
remove_index = random.randint(0, length - 1)
list.pop(remove_index)

print("\n")
print("NEW list NEW list")
print(list)

def balls():
    counter = 1
    if len(list) == 0:
        list.append(1)
        print("\n")
        print("NEW NEW UPDATED LIST:")
        print(list)

    else:
        for y in list:
            if y == counter:
                if counter == len(list) and length != len(list):
                    list.append(length)
                    
                    break
                counter += 1
            else:
                list.insert((counter - 1), counter)
                break
        print("\n")
        print("NEW NEW UPDATED LIST:")
        print(list)
balls()