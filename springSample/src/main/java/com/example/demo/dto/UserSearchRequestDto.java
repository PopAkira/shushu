package com.example.demo.dto;

import java.io.Serializable;

import lombok.Data;

/**
 * ユーザー情報 検索用リクエストデータ
 */
@Data
public class UserSearchRequestDto implements Serializable {

  /**
   * ユーザーID
   */
  private Long id;
  
  //public UserSearchRequestDto() {}
}