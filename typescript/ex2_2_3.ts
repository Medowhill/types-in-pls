function write(data: string | number): void {
    if (typeof data === "string") {
        let str: string = data;
    } else {
        let num: number = data;
    }
}

write("a");
write(1);
