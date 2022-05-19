class Comparable a where
  gt :: a -> a -> Bool

instance Comparable Int where
  gt v1 v2 = v1 > v2

instance Comparable String where
  gt v1 v2 = v1 > v2

_ = gt (1 :: Int) 2
_ = gt "a" "b"

sort :: Comparable a => [a] -> ()
sort lst = if gt (lst !! 0) (lst !! 1) then () else ()

_ = sort [2 :: Int, 3, 1]
_ = sort ["b", "c", "a"]

main = return ()
