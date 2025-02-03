import random
import sys
def spin():
    a = 0
    b = 0
    c = 0
    win = 0 
    lose = 0
    ingresso = input("int the number of spin or press q to quit:")
    if ingresso == "q":
        sys.exit()
    else:
        for d in range(int(ingresso)):
            print(f"\n--{d+1}--")
            for e in range(5):
                a = random.randint(1,3)
                b = random.randint(1,3)
                c = random.randint(1,3)
                print(f"  {a},{b},{c}")
            if a==b and b==c and c==a:
                print("\033[32myou win\033[37m");
                win=win+1
            else:
                print("\033[31myou lose\033[37m")
                lose=lose+1
        print(f"\033[32myou won for :{win}, \033[31myou lose for :{lose}\033[37m")
def main():
    while True:
        print("\n int the number of spin \n")
        spin()
if __name__=="__main__":
    main()