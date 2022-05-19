let choose v1 v2 = if true then v1 else v2

let _ =
  let str: string = choose "Korean" "Foreigner" in
  let num: int = choose 1 2 in
  ()
