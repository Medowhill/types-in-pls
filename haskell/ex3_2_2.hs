data Chooser a = Chooser a a

choose (Chooser v1 v2) = if True then v1 else v2

c :: Chooser Int
c = Chooser 1 2

n :: Int
n = choose c

main = return ()
