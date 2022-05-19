struct Chooser;

impl Chooser {
    fn choose<T>(&self, v1: T, v2: T) -> T { if true { v1 } else { v2 } }
}

fn main() {
    let c = Chooser;
    c.choose::<i32>(1, 2);
}
