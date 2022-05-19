data ArrayList a = ArrayList
data LinkedList a = LinkedList

class ListLike (l :: * -> *) where
  len :: l a -> Int
  add :: l a -> a -> ()

instance ListLike ArrayList where
  len lst = 0
  add lst elem = ()

instance ListLike LinkedList where
  len lst = 0
  add lst elem = ()

addUntil :: ListLike l => l a -> a -> Int -> ()
addUntil lst v l =
  let _ = len lst in
  add lst v

main = return ()
