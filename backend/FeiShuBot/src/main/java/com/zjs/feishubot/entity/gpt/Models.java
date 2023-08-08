package com.zjs.feishubot.entity.gpt;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Models {

  /**
   * 默认模型
   */
  public static final String DEFAULT_MODEL = "Default (GPT-3.5)";


  /**
   * 模型title和对应模型
   */
  public static Map<String, Model> modelMap = new HashMap<>();

  /**
   * plus模型title池 用于判断请求是否是plus模型
   */
  public static Set<String> plusModelTitle = new HashSet<>();

  /**
   * normal模型title池
   */
  public static Set<String> normalModelTitle = new HashSet<>();

  public static boolean isPlusModel(String modelTitle) {
    return plusModelTitle.contains(modelTitle);
  }
}
