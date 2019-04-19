/*
 * Copyright (C) 2008 ZXing authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.zxing.android;

import android.app.Activity;

/**
 * The main settings activity.
 * 设置相关的常量
 *
 * @author dswitkin@google.com (Daniel Switkin)
 * @author Sean Owen
 */
public final class PreferencesActivity extends Activity {

  public static final String KEY_DECODE_1D_PRODUCT = "preferences_decode_1D_product";
  public static final String KEY_DECODE_1D_INDUSTRIAL = "preferences_decode_1D_industrial";
  public static final String KEY_DECODE_QR = "preferences_decode_QR";
  public static final String KEY_DECODE_DATA_MATRIX = "preferences_decode_Data_Matrix";
  public static final String KEY_DECODE_AZTEC = "preferences_decode_Aztec";
  public static final String KEY_DECODE_PDF417 = "preferences_decode_PDF417";
  public static final String KEY_PLAY_BEEP = "preferences_play_beep";
  public static final String KEY_VIBRATE = "preferences_vibrate";
  public static final String KEY_AUTO_FOCUS = "preferences_auto_focus";

  public static final String KEY_DISABLE_CONTINUOUS_FOCUS = "preferences_disable_continuous_focus";

}
