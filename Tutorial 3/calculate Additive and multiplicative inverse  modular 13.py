# VERY simple additive inverse -x mod 13
#for x in range(0, 13):
#    #print (x, end="", flush=True)
#    print (-x % 13)



# Python 3 program to find modular  
# inverse of a under modulo m 
#https://www.geeksforgeeks.org/multiplicative-inverse-under-modulo-m/
# A naive method to find modulor  
# multiplicative inverse of 'a'  
# under modulo 'm' 
def modInverse(a, m) : 
    a = a % m; 
    for x in range(1, m) : 
        if ((a * x) % m == 1) : 
            return x 
    return 1
  
# Driver Program 
m = 13
for a in range(1,13):
    print(modInverse(a, m)) 
