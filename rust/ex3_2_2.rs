struct Chooser<T> { v1: T, v2: T }

impl<T> Chooser<T> {
    fn choose(self) -> T {
        if true { self.v1 } else { self.v2 }
    }
}

fn main() {
    let c: Chooser<i32> = Chooser::<i32> { v1: 1, v2: 2 };
    let n: i32 = c.choose();
}
