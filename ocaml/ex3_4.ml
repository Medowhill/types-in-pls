module type TIMESTAMPER = sig
  type t
  val init: t
  val next: t -> t
  val cmp: t -> t -> bool
end

module IntTimestamper = struct
  type t = int
  let init = 0
  let next t = t + 1
  let cmp t1 t2 = t1 < t2
end

module StringTimestamper = struct
  type t = string
  let init = "a"
  let next t = String.cat t "a"
  let cmp t1 t2 = (String.length t1) < (String.length t2)
end

let create (_: unit): (module TIMESTAMPER) =
  if true then (module IntTimestamper) else (module StringTimestamper)

let _ =
  let module T = (val create (): TIMESTAMPER) in
  let ts0: T.t = T.init in
  let ts1: T.t = T.next ts0 in
  T.cmp ts0 ts1
