trait Comparable {
    fn gt(v1: &Self, v2: &Self) -> bool;
}

impl Comparable for i32 {
    fn gt(v1: &i32, v2: &i32) -> bool { v1 > v2 }
}

fn sort<T: Comparable>(lst: Vec<T>) -> () {
    if Comparable::gt(&lst[0], &lst[1]) {}
}

impl<T: Comparable> Comparable for Vec<T> {
    fn gt(v1: &Vec<T>, v2: &Vec<T>) -> bool {
        if Comparable::gt(&v1[0], &v2[0]) {}
        true
    }
}

fn main() {
    sort::<Vec<i32>>(vec![vec![1, 2], vec![1, 2, 3], vec![1]]);
    sort::<Vec<Vec<i32>>>(vec![]);
}
