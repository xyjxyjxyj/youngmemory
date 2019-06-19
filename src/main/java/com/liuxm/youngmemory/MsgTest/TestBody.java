package com.liuxm.youngmemory.MsgTest;


public class TestBody extends MsgPiece {
    
    private static final MsgField[] items = new MsgField[]{
        new MsgField("content", 20, ' ', MsgField.FillSide.RIGHT),
    };
    
    public TestBody() {
        super(items);
    }
    
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}