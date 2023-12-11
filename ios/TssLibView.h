// This guard prevent this file to be compiled in the old architecture.
#ifdef RCT_NEW_ARCH_ENABLED
#import <React/RCTViewComponentView.h>
#import <UIKit/UIKit.h>

#ifndef TssLibViewNativeComponent_h
#define TssLibViewNativeComponent_h

NS_ASSUME_NONNULL_BEGIN

@interface TssLibView : RCTViewComponentView
@end

NS_ASSUME_NONNULL_END

#endif /* TssLibViewNativeComponent_h */
#endif /* RCT_NEW_ARCH_ENABLED */
