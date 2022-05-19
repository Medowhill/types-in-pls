class Comparable a where
  gt :: a -> a -> Bool

instance Comparable Int where
  gt v1 v2 = v1 > v2

sort :: Comparable a => [a] -> ()
sort lst = if gt (lst !! 0) (lst !! 1) then () else ()

instance Comparable a => Comparable [a] where
  gt v1 v2 = if gt (v1 !! 0) (v2 !! 0) then True else True

_ = sort [[1 :: Int, 2], [1, 2, 3], [1]]
_ = sort [[[1 :: Int]]]

main = return ()
