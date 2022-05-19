data Timestamper = forall t. Timestamper {
  ini :: t,
  next :: t -> t,
  cmp :: t -> t -> Bool
}

intIni = 0
intNext t = t + 1
intCmp t1 t2 = t1 < t2
intTimestamper = Timestamper {
  ini = intIni,
  next = intNext,
  cmp = intCmp
}

stringIni = "a"
stringNext t = t ++ "a"
stringCmp t1 t2 = length t1 < length t2
stringTimestamper = Timestamper {
  ini = stringIni,
  next = stringNext,
  cmp = stringCmp
}

create :: () -> Timestamper
create _ = if True then intTimestamper else stringTimestamper

_ =
  let t = create () in
  case t of
    Timestamper { ini = ini, next = next, cmp = cmp } ->
      let ts0 = ini in
      let ts1 = next ts0 in
      cmp ts0 ts1

main = return ()
