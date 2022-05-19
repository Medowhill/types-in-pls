trait Comparable {
    fn gt(v1: &Self, v2: &Self) -> bool;
}

impl Comparable for i32 {
    fn gt(v1: &i32, v2: &i32) -> bool { v1 > v2 }
}

impl Comparable for String {
    fn gt(v1: &String, v2: &String) -> bool { v1 > v2 }
}

fn sort<T: Comparable>(lst: Vec<T>) -> () {
    if Comparable::gt(&lst[0], &lst[1]) {}
}

impl<T> Comparable for Vec<T> {
    fn gt(v1: &Vec<T>, v2: &Vec<T>) -> bool { v1.len() > v2.len() }
}

fn main() {
    Comparable::gt(&1, &2);
    Comparable::gt(&"a".to_string(), &"b".to_string());
    sort::<i32>(vec![2, 3, 1]);
    sort::<String>(vec!["b".to_string(), "c".to_string(), "a".to_string()]);
    sort::<Vec<i32>>(vec![vec![1, 2], vec![1, 2, 3], vec![1]]);
}
