function error(): never {
  throw new Error();
}

function assertNonzero(num: number): number {
  return (num != 0) ? num : error();
}

function assertShort(str: string): string {
  return (str.length <= 10) ? str : error();
}
