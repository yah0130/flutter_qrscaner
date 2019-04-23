#import "FlutterQrscanerPlugin.h"
#import <flutter_qrscaner/flutter_qrscaner-Swift.h>

@implementation FlutterQrscanerPlugin
+ (void)registerWithRegistrar:(NSObject<FlutterPluginRegistrar>*)registrar {
  [SwiftFlutterQrscanerPlugin registerWithRegistrar:registrar];
}
@end
