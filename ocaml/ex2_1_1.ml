class person (email: string) = object
  method email: string = email
end

class student (email: string) (grade : int) = object
  inherit person email
  method grade: int = grade
end

let send_email (person: < email: string; .. >): unit =
  let email: string = person#email in
  ()

let _ =
  let st: student = new student "" 0 in
  send_email st
