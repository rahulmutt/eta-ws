module Lib where

foreign export java "@static ws_eta.Lib.foo" foo1 :: Int -> Int

foo1 _ = 3
