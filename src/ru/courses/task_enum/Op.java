package ru.courses.task_enum;

public enum Op {

    OP_1(1),
    OP_2(2),
    OP_3(3),
    OP_4(4);

    public int getOp() {
        return op;
    }

    Op(int op) {
        this.op = op;
    }

    private int op;
}
