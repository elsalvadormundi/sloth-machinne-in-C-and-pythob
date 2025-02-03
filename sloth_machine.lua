local function spin()
    local a = 0
    local b = 0
    local c = 0
    local win = 0
    local lose = 0
    print("input a numbber of spin or q to quit: ")
    local ingresso = io.read()
    if ingresso == "q" then
        os.exit()
    else
        for i = 1, ingresso do
            io.write("--",i,"--\n")
            for j = 1, 5 do
                a = math.random(0, 3)
                b = math.random(0, 3)
                c = math.random(0, 3)
                io.write(a, "-", b, "-", c, "\n")
            end
            if(a==b) and (b==c) and (c==a) then
                print("\27[32mYou won\n\27[0m")
                win = win + 1
            else
                print("\27[31mYou lose\n\27[0m")
                lose = lose + 1
            end
        end
        io.write("\27[32mYou won for=",win,"\27[31m You lose for=",lose,"\n\27[0m")
    end
end

local function main()
    while true do
        spin()
    end
end

main()