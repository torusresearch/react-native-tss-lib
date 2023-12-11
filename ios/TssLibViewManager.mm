#import <React/RCTViewManager.h>
#import <React/RCTUIManager.h>
#import "RCTBridge.h"

@interface TssLibViewManager : RCTViewManager
@end

@implementation TssLibViewManager

RCT_EXPORT_MODULE(TssLibView)

- (UIView *)view
{
  return [[UIView alloc] init];
}

RCT_EXPORT_VIEW_PROPERTY(color, NSString)

@end
