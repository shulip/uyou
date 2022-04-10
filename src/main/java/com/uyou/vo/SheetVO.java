package com.uyou.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SheetVO {
    private String sheetId;
    private String title;
    private int index;
    private int rowCount;
    private int columnCount;
}
