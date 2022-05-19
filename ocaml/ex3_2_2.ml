type 'a chooser = Chooser of 'a * 'a

let choose (Chooser (v1, v2)) = if true then v1 else v2

let _ =
  let c: int chooser = Chooser (1, 2) in
  let n: int = choose c in
  ()
