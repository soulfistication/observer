//
//  SecurityManager.h
//  SecurityGate
//
//  Created by Ivan Almada on 8/15/19.
//  Copyright © 2019 Ivan. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "SecurityGate.h"

NS_ASSUME_NONNULL_BEGIN

@interface SecurityManager : NSObject

@property (nonatomic, strong) SecurityGate *gate;

- (instancetype)initWithGate:(SecurityGate *)gate;

@end

NS_ASSUME_NONNULL_END
