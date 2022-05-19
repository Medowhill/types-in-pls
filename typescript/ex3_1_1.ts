function choose<T>(v1: T, v2: T): T { return true ? v1 : v2; }

let str: string = choose<string>("Korean", "Foreigner");
let num: number = choose<number>(1, 2);
