class Solution:
    def __init__(self):
        # Every index of prime stores zero or one
        # If prime[i] is zero means i is not a prime
        # If prime[i] is one means i is a prime
        self.prime=[1 for i in range(10001)]
        
        for p in range(2, int(9999 ** 0.5)+ 1):
            if self.prime[p]:
                for i in range(p*p, 10000, p):
                    self.prime[i] = 0

    def shortestPath(self,Num1,Num2):
        # Complete this function using prime list
        if (Num1 == Num2):
            return 0
        
        qu = [(Num1, 0)]
        visited_no = {Num1}
        while qu:
            x, y = qu.pop(0)
            if x == Num2:
                return y
                
            for k in range(1, 5):
                for a in range(10):
                    divisor = 10 ** (4-k)
                    no_at_index = (x // divisor) % 10
                    
                    if no_at_index == a:
                        continue
                    new_no = x + (a - no_at_index) * divisor
                    if (1000 <= new_no < 10000) and (new_no not in visited_no) and self.prime[new_no]:
                        qu.append((new_no, y + 1))
                        visited_no.add(new_no)

        return -1
