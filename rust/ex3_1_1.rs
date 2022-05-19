fn choose<T>(v1: T, v2: T) -> T { if true { v1 } else { v2 } }

fn main() {
    let str: String = choose::<String>("Korean".to_string(), "Foreigner".to_string());
    let num: i32 = choose::<i32>(1, 2);
}
