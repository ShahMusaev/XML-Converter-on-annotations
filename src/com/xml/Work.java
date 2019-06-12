package com.xml;

import com.xml.XMLAttribute;
import com.xml.XMLObject;
import com.xml.XMLTag;

@XMLObject
public class Work {
    @XMLTag(name = "Info")
    private final String str = "I'm Student";

    @XMLAttribute(name = "Student")
    private final String status = "";

}
