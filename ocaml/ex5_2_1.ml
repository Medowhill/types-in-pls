class vector = object
  method length: int = 0
end

class sparse_vector = object
  inherit vector
  method nonzeros: int list = []
  method length: int = 1
end

let _ =
  let v: < length: int; .. > = new sparse_vector in
  v#length
