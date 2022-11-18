
inp = (input("Enter IP address : ")).split(".")
x = int(inp[0])

print("Octete 1 : " + inp[0])
print("Octete 2 : " + inp[1])
print("Octete 3 : " + inp[2])
print("Octete 4 : " + inp[3])

if x in range(1,127):
    print("Subnet mask : 255.0.0.0\nClass : A")
elif x in range(127,192):
    print("Subnet mask : 255.255.0.0\nClass : B")
elif x in range(192,224):
    print("Subnet mask : 255.255.255.0\nClass : C")
else:
    print("Invalid IP Address")

