choose v1 v2 = if True then v1 else v2

str :: String
str = choose "Korean" "Foreigner"

num :: Int
num = choose 1 2

main = return ()
