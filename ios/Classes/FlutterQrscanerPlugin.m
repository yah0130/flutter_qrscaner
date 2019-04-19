#import "FlutterQrscanerPlugin.h"
#import <flutter_plugin/flutter_plugin-Swift.h>

@implementation FlutterQrscanerPlugin
+ (void)registerWithRegistrar:(NSObject<FlutterPluginRegistrar>*)registrar {
  [SwiftFlutterQrscanerPlugin registerWithRegistrar:registrar];
}
@end
