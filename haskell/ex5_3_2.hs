class Comparable a where
  gt :: a -> a -> Bool

instance Comparable Int where
  gt v1 v2 = v1 > v2

sort :: Comparable a => [a] -> ()
sort lst = if gt (lst !! 0) (lst !! 1) then () else ()

instance Comparable [a] where
  gt v1 v2 = (length v1) > (length v2)

_ = sort [[1 :: Int, 2], [1, 2, 3], [1]]

main = return ()
