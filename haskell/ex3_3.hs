simulate :: (forall a.[a] -> a) -> ()
simulate rand =
  let number = rand [1, 2] in
  let species = rand ["a", "b"] in
  ()

randUniform lst = head lst
randGeometric lst = head lst

_ = simulate randUniform
_ = simulate randGeometric

main = return ()
