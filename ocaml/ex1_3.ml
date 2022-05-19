let is_positive (num: int): bool = num > 0

let print_string (str: string): unit = ()

let add (num1: int) (num2: int): int = num1 + num2

let _ =
  let res: int = 3 in
  is_positive 1;
  print_string "2";
  add 1 2
