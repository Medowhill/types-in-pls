class person = object
  method send_email (content: string): unit = ()
end

let send_new_year_email (dst: < send_email: string -> unit; .. >): unit =
  dst#send_email ""

let _ =
  let pr: person = new person in
  send_new_year_email pr
