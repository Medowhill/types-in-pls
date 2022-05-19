class vector = object
  method add (v: sparse_vector): vector = new vector
end
and sparse_vector = object
  inherit vector
  method nonzeros: int list = []
  method add (v: sparse_vector): vector = new vector
end
